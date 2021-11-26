package Main;

/**
 * Абстрактный класс Компилятор
 */
public abstract class Compiler {

    /**
     * Исходный код
     */
    private String startCode;
    /**
     * Машинный код
     */
    private String machineCode;


    //пуск компиляции
    public void run(){
        lexicalAnalysis();
        syntacticAnalysis();
        semanticAnalysis();
        errorsMessage();
        machineCode();
    }

    public void setCode(String code){
        this.startCode = code;
    }


    /**
     * Абстрактные методы класса
     */
    //лекцический анализ
    public abstract void lexicalAnalysis();

    //синтаксический анализ(парсинг)
    public abstract void syntacticAnalysis();

    //семантический анализ
    public abstract void semanticAnalysis();

    //Машинный код
    public abstract void machineCode();

    //Сообщения об ошибках
    public abstract void errorsMessage();

    //вывод таблицы лексем
    public abstract void LEX_table_output();

    //вывод таблицы идентификаторов
    public abstract void ID_table_output();

    //вывод ДСР
    public abstract void DSR_output();

    //вывод триад
    public abstract void TRIADS_output();

    //вывод результатов оптимизации
    public abstract void OPTIMIZATION_RESULT_output();

    //вывод объектного кода
    public abstract void OBJECT_CODE_output();

}
