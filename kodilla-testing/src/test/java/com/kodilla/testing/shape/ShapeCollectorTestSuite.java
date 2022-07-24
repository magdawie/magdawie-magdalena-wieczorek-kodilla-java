package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    class ForumTestSuite {
        private static int testCounter = 0;

        @BeforeAll
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterAll
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @BeforeEach
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }
    }
    @Nested
    @DisplayName("Tests for adding figures")
    class TestAdd {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(new Circle(1));
            shapeCollector.addFigure(new Square(2));
            shapeCollector.addFigure(new Triangle(4,3));
            //Then
            Assertions.assertEquals(3, shapeCollector.getListShapes().size());
        }

    }
    @Nested
    @DisplayName("Tests for removing figures")
    class TestRemove {
        @Test
        void testRemoveFigure() {
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(1));
            shapeCollector.addFigure(new Square(1));
            shapeCollector.addFigure(new Triangle(4,3));
            shapeCollector.addFigure(new Triangle(1,1));
            shapeCollector.removeFigure(new Circle(1));
            shapeCollector.removeFigure(new Square(1));
            shapeCollector.removeFigure(new Triangle(1,1));
            Assertions.assertEquals(1, shapeCollector.getListShapes().size());
        }
    }
    @Nested
    @DisplayName("Tests for getting figures")
    class TestGet {
        @Test
        void testGetFigure() {
            Shape shapeTriangle = new Triangle(1,4);
            Shape shapeCircle = new Circle(1);
            Shape shapeSquare = new Square(1);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(shapeSquare);
            shapeCollector.addFigure(shapeCircle);
            shapeCollector.addFigure(shapeTriangle);
            shapeCollector.addFigure(shapeTriangle);
            shapeCollector.addFigure(shapeCircle);
            Shape shape =  shapeCollector.getFigure(1);
            Shape shape2 = shapeCollector.getFigure(3);
            Shape shape3 = shapeCollector.getFigure(5);
            Assertions.assertEquals(shapeCircle, shape);
            Assertions.assertEquals(shapeTriangle, shape2);
            Assertions.assertEquals(null, shape3);
        }
    }
    @Nested
    @DisplayName("Tests for showing figures")
    class TestShow {
        @Test
        void testShowFigures() {
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(1));
            shapeCollector.addFigure(new Square(1));
            shapeCollector.addFigure(new Triangle(4,3));
            shapeCollector.addFigure(new Triangle(1,1));
            String figures = shapeCollector.showFigures();
            Assertions.assertEquals("Circle, Square, Triangle, Triangle", figures);

        }
    }


}
