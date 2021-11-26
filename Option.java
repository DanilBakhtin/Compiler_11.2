package Main;

import java.util.Scanner;

class Creator_Compiler{
    private  String language;
    public void setLanguage(String language){
        this.language = language;
    }
    public Compiler createCompiler(){
        if (language.equals("Java"))
            return new JavaCompiler();
        else if (language.equals("PHP"))
            return new PHPCompiler();
        else if (language.equals("JS"))
            return new JSCompiler();
        else if (language.equals("Pascal"))
            return new PascalCompiler();
        else return null;
    }
}

class Starter_Compiler{

    public void compile(Compiler compiler){
        compiler.run();
    }

}

class  Enter_Code{

    public void inputCode(Compiler compiler, String code){
        compiler.setCode(code);
    }
}

class Output_Result{

    public void printResult(Compiler compiler){

        Scanner in = new Scanner(System.in);
        System.out.println("Команды:\n" +
                "1. Завершение программы\n" +
                "2. Вывести таблицу лексем\n" +
                "3. Вывести таблицу идентификаторов\n" +
                "4. Вывести ДСР\n" +
                "5. Вывести триады\n" +
                "6. Вывести результат оптимизации\n" +
                "7. Вывести объектный код\n");

        while (true) {
            System.out.println("Ввод пункта: ");
            String command = in.nextLine();
            switch (command) {
                case "1":
                    System.out.println("\nПрограмма завершена!");
                    return;
                case "2":
                    compiler.LEX_table_output();
                    break;
                case "3":
                    compiler.ID_table_output();
                    break;
                case "4":
                    compiler.DSR_output();
                    break;
                case "5":
                    compiler.TRIADS_output();
                    break;
                case "6":
                    compiler.OPTIMIZATION_RESULT_output();
                    break;
                case "7":
                    compiler.OBJECT_CODE_output();
                    break;
                default:
                    System.out.println("Нет такой команды!");
            }
        }

    }
}
