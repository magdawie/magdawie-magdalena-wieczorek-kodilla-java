package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

     ArrayList<Shape> shapes = new ArrayList<>();

    public List<Shape> getListShapes(){
        return shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }
    public Shape getFigure(int n) {
        if(n>shapes.size()-1) {
            return null;
        }
        return shapes.get(n);

    }
    public String showFigures() {
        String figures = "";

        for(int n = 0; n < shapes.size(); n++) {
            figures += shapes.get(n).getShapeName();

            if(n<(shapes.size()-1))
                figures+=", ";
        }
        return figures;
    }

}
