package Main;

/**
 * Компилятор javascript
 */
public class JSCompiler extends Compiler{

    /**
     * Реализация абстрактных методов методов
     */
    @Override
    public void lexicalAnalysis() {
        System.out.println("Выполняется лексический анализ...");
    }

    @Override
    public void syntacticAnalysis() {
        System.out.println("Выполняется синтаксический анализ анализ...");
    }

    @Override
    public void semanticAnalysis() {
        System.out.println("Выполняется семантический анализ...");
    }

    @Override
    public void machineCode() {
        System.out.println("Выполняется преобразование в машинный код...");
    }

    @Override
    public void errorsMessage(){
        System.out.println("Обнаружено 0 ошибок...");
    }

    @Override
    public void LEX_table_output() {
        System.out.println("# Таблица лексем #");
    }

    @Override
    public void ID_table_output() {
        System.out.println("# Таблица идентификаторов #");
    }

    @Override
    public void DSR_output() {
        System.out.println("# ДСР #");
    }

    @Override
    public void TRIADS_output() {
        System.out.println("# Триады #");
    }

    @Override
    public void OPTIMIZATION_RESULT_output() {
        System.out.println("# Результаты оптимизации #");
    }

    @Override
    public void OBJECT_CODE_output() {

        System.out.println("# Объектный код #");
    }
}
