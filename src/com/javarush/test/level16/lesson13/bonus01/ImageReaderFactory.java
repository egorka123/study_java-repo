package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Egor on 14.05.2015.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes paint)
    {


           if (paint == ImageTypes.JPG)
               return new JpgReader();
           else if (paint == ImageTypes.BMP)
               return new BmpReader();
           else if (paint == ImageTypes.PNG)
               return new PngReader();
           else throw new IllegalArgumentException("Неизвестный тип картинки");


    }
}
