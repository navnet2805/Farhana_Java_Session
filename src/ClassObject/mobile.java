package ClassObject;

public class mobile {

    //features --- consider this is mobile class.
    int ram, rom, camera;
    double display;

    mobile()
    {

    }

    mobile(int ram, int rom, int camera, double display)
    {
        this.ram = ram;
        this.rom=rom;
        this.camera=camera;
        this.display=display;
    }

    public static void main(String[] args)
    {
        //for each feature i am creating 1 mobile
//        new mobile(); // new is a keyword || mobile() is a constructor
//        new mobile().ram = 12;
//        new mobile().rom = 256;
//        new mobile().camera = 3;
//        new mobile().display = 6.2;

        //-- Object is created 1st and then the values are assigned to it
//        mobile SamsungS24Ultra5g = new mobile();
//        SamsungS24Ultra5g.ram = 8;
//        SamsungS24Ultra5g.rom = 128;
//        SamsungS24Ultra5g.camera= 108;
//        SamsungS24Ultra5g.display=6.79;

        mobile SamsungS24Ultra5g1 = new mobile(8,128,108,6.79);
        System.out.println("Samsung ram: "+SamsungS24Ultra5g1.ram); //using the mobile
        mobile iphone = new mobile(1,1,48,6.6);
        System.out.println("iphone ram: "+iphone.ram);







    }



}
