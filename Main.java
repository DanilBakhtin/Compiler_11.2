package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Creator_Compiler creator = new Creator_Compiler();
        System.out.print("Язык: ");
        String lang = in.nextLine();
        creator.setLanguage(lang);

        Compiler compiler = creator.createCompiler();

        Enter_Code enter_code = new Enter_Code();
        System.out.print("Введите код: ");
        String code = in.nextLine();
        enter_code.inputCode(compiler,code);

        Starter_Compiler starter = new Starter_Compiler();
        starter.compile(compiler);
        System.out.println("Компиляция завершена!\n");

        Output_Result output_result = new Output_Result();
        output_result.printResult(compiler);
    }
}
