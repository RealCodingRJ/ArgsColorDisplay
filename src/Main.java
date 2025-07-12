import java.io.FileWriter;
import java.util.Date;
import java.util.Random;

interface WELCOME_MESSAGE {
    static void createMessage(String message) {
        System.out.println(message);
    }
}


class Main implements WELCOME_MESSAGE {

    public static void main(String[] args)  {

        if (args.length > 0) {

            if (args[0].equalsIgnoreCase("--Dec")) {

                WELCOME_MESSAGE.createMessage(date());


                draw_hex(Integer.parseInt(args[1]));
                draw_hex(Integer.parseInt(args[1]));
                draw_hex(Integer.parseInt(args[1]));


            }

            if (args[0].equalsIgnoreCase("--Hex")) {

                WELCOME_MESSAGE.createMessage(date());

                getArgsFile(args[1]);
                getArgsFile(args[1]);
                getArgsFile(args[1]);

            }

            if (args[0].equalsIgnoreCase("--Random")) {

                WELCOME_MESSAGE.createMessage(date());
                getRGB();
            }

        }

    }

    public static void getRGB(){

        Random Values = new Random();

        int red = Values.nextInt(1, 255);
        int green = Values.nextInt(1, 255);
        int blue = Values.nextInt(1, 255);
        draw_hex(red);
        draw_hex(green);
        draw_hex(blue);

    }

    public static void draw_hex(int dec)  {

        String dec1 = Integer.toHexString(dec);

        try (FileWriter f = new FileWriter("Colors.md", false)) {

            f.write(dec1);
            f.write(dec1);
            f.write(dec1);


        } catch (Exception ce) {
            System.out.println(ce.getMessage());
        }


    }

    public static void getArgsFile(String args) {

        try (FileWriter f = new FileWriter("Colors.md", false)) {

            f.write(String.valueOf(Integer.parseInt(args, 16)));


        } catch (Exception ce) {
            System.out.println(ce.getMessage());
        }


    }


    public static String date() {

        Date e = new Date();
        return e.toString();

    }

}