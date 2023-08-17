package Lab11;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Koch extends Canvas {


    private static final long serialVersionUID = 546343032002044481L;


    public void paint(Graphics g) {
        g.setColor(Color.black);

        Point a = new Point(0, 10);
        Point b = new Point(this.getWidth(), 10);

        drawKochLine(g, a, b, 0, 4);
    }


    public void drawKochLine(Graphics g, Point a, Point b, double fi, int n) {

        if (n <= 0) {
            // рисуем прямую, если достигнута необходимая глубина рекурсии.
            g.drawLine(a.x, a.y, b.x, b.y);
        } else {
            // находим длину отрезка (a; b).
            double length = Math.pow(Math.pow(b.y - a.y, 2)
                    + Math.pow(b.x - a.x, 2), 0.5);
            // находим длину 1/3 отрезка (a; b)
            double length1of3 = length / 3;

            // находим т., делящую отрезок как 1:3.
            Point a1 = new Point(a.x + (int) Math.round((length1of3 * Math.cos(fi))), a.y + (int) Math.round((length1of3 * Math.sin(fi))));

            // находим т., делящую отрезок как 2:3.
            Point b1 = new Point(a1.x + (int) Math.round((length1of3 * Math.cos(fi))), a1.y + (int) Math.round((length1of3 * Math.sin(fi))));

            // находим т., которая будет вершиной равностороннего
            // треугольника.
            Point c = new Point(a1.x + (int) Math.round((length1of3 * Math.cos(fi + Math.PI / 3))), a1.y + (int) Math.round((length1of3 * Math.sin(fi + Math.PI / 3))));

            n--;
            drawKochLine(g, a1, c, fi + Math.PI / 3, n);
            drawKochLine(g, c, b1, fi - Math.PI / 3, n);

            n--;
            drawKochLine(g, a, a1, fi, n);
            drawKochLine(g, b1, b, fi, n);
        }
    }
    public static int width = 800, height = 600;


    public static void main(String[] args) {
        final Frame fr = new Frame("Кривая Коха");
        fr.setSize(width, height);
        fr.add(new Koch());
        fr.setVisible(true);
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fr.dispose();
            }
        });

    }
}