package com.shape;

public class ShapeMain
{
	public static void main(String args[])
	{
		//Creating object for circle
		TwoDimentionalShape twodshape = new Circle((float)8);
		twodshape.getArea();
		
		//Creating object for Square
		TwoDimentionalShape twodshape1 = new Square((float)8);
		twodshape1.getArea();
		
		//Creating object for Triangle
		TwoDimentionalShape twodshape2 = new Triangle((float)9, (float)7);
		twodshape2.getArea();
		
		//Creating object for SphareArea
		ThreeDimentionalShape threedshape = new Sphare((float)8);
		threedshape.getArea();
		
		//Creating object for Spharevolume
		ThreeDimentionalShape threedshape1 = new Sphare((float)8);
		threedshape1.getVolume();
		
		//Creating object for Cube Area
		ThreeDimentionalShape threedshape2 = new Cube((float)3);
		threedshape2.getArea();
		
		//Creating object for  Cube volume
		ThreeDimentionalShape threedshape3 = new Cube((float)3);
		threedshape3.getVolume();
		
		//Creating object for Cuboid Area
		ThreeDimentionalShape Cuboid1 = new Cuboid((float)3, (float)5, (float)2);
		Cuboid1.getArea();
		
		//Creating object for  Cuboid volume
		ThreeDimentionalShape Cuboid2 = new Cuboid((float)3, (float)5, (float)2);
		Cuboid2.getVolume();
   }
}