package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class CalculatorServiceTest {
    
    private Calculator calculator;
    private CalculatorService service;

//    @Test
//    void testCalculatorService() {
////        fail("まだ実装されていません"); // default
//    }
    
    @BeforeEach // 結合テストの際は、はじめにテストで使用するオブジェクトの用意やデータベースの初期化等を行う（BeforeEach）
    public void setUp() {
        // テスト前にCalculatorとCalculatorServiceをセットアップ
        calculator = new Calculator();
        service = new CalculatorService(calculator);
    }

    @Test
    void testAddAndReport() {
//        fail("まだ実装されていません"); // default
        // CalculatorのaddメソッドとCalculatorServiceのaddAndReportメソッドが連携できているかをテスト
        assertEquals("Result: 5", service.addAndReport(2, 3));
    }
    
    @Test
    void testSubstractAndReport() {
//        fail("まだ実装されていません"); // default
     // CalculatorのsubtractメソッドとCalculatorServiceのsubtractAndReportメソッドが正しく連携するかテスト
        assertEquals("Result: 1", service.substractAndReport(3, 2));
    }

}
