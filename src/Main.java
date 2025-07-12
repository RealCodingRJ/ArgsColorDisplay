import java.io.FileWriter;

class Main {

    public static void main(String[] args)  {

        if (args.length > 0) {

            if (args[0].equalsIgnoreCase("--Dec")) {


                draw_hex(Integer.parseInt(args[1]));
                draw_hex(Integer.parseInt(args[1]));
                draw_hex(Integer.parseInt(args[1]));


            }

            if (args[0].equalsIgnoreCase("--Hex")) {

                getArgsFile(args[1]);
                getArgsFile(args[1]);
                getArgsFile(args[1]);

            }
            
        }

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

}