public class Learning {
    public static void main(String[] args) {

        System.out.println("Mani pirmie kodi");
        String vards = "Ilga";
        System.out.println(vards);
        int cipars = 18;
        System.out.println(cipars);
        //var ciparu vertibu definet ar tekstu
        int vecums;
        vecums = 35;
        System.out.println(vecums);
        //var mainit noteikto cipara vertibu vardam
        int mainuvecumu = 20;
        mainuvecumu = 15;
        System.out.println(mainuvecumu);
        //lai nebutu jamaina viss kods var noteikt gala vertibu vardam ar final int
        //citi saglabasanas kodi
//         int skaitlis = 5;
//        float decimalskaitlis = 5.99f;
//        char burts = 'D';
//        boolean patiesiba = true;
//        String teksts = "Hello";
        //teksts plus atseviski noteikts teksts
        String mansVards = "Ilga ";
        System.out.println("Miezaine_Mustermane " + mansVards);
        //lai noteiktu visu vardu uzvardu ar saisinajumu
        String mansUzvards = "Miezaine Mustermane";
        String mansVardsUzvards = mansVards + mansUzvards;
        System.out.println(mansVardsUzvards);
        //matematiski piemeri
        int x = 5;
        int y = 6;
        System.out.println(x + y); //saglaba summas vertibu

        // isak var rakstit   int a = 5, int b = 6, int c = 50;
        int a = 5;
        int b = 6;
        int c = 50;
        System.out.println(a + b + c);

        int d, e, f;
        d = e = f = 50;
        System.out.println(d + e + f);
        //The general rules for naming variables are:
        //
        //Names can contain letters, digits, underscores, and dollar signs
        //Names must begin with a letter
        //Names should start with a lowercase letter and it cannot contain whitespace
        //Names can also begin with $ and _ (but we will not use it in this tutorial)
        //Names are case sensitive ("myVar" and "myvar" are different variables)
        //Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        //Data types are divided into two groups:
        //
        //Primitive data types - includes byte, short, int, long, float, double, boolean and char
        //Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
        //Primitive Data Types
        //A primitive data type specifies the size and type of variable values, and it has no additional methods.
        //
        //There are eight primitive data types in Java:

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
// Use float or double?
//
//The precision of a floating point value indicates how many digits the value can have after the decimal point.
// The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits.
// Therefore it is safer to use double for most calculations.
     //Scientific Numbers
        // A floating point number can also be a scientific number with an "e" to indicate the power of 10:

        //Very often in programming, you will need a data type that can only have one of two values, like:
        //
        //YES / NO
        //ON / OFF
        //TRUE / FALSE
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //Non-Primitive Data Types
        //Non-primitive data types are called reference types because they refer to objects.
        //
        //The main difference between primitive and non-primitive data types are:
        //
        //Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
        //Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
        //A primitive type has always a value, while non-primitive types can be null.
        //A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
        //The size of a primitive type depends on the data type, while non-primitive types have all the same size.
        //Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.



    }
}
