import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    CheckingAccount checkingAccount = new CheckingAccount(100,123456,"Sorry");
    private static  int count;

    @BeforeAll
    static void setUpAll(){
        System.out.println("@BeforeAll is executed");
        System.out.println("Count " + count++);
    }
    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach is executed");
        System.out.println("Count " + count++);
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach is executed");
        System.out.println("Count " + count++);
    }

    @AfterAll
    static void tearAll(){
        System.out.println("@AfterAll is executed");
        System.out.println("Count " + count++);
    }

    @Test
    void deposit() {
        assertEquals(370,checkingAccount.deposit(270));
        checkingAccount.deposit(270);
        System.out.println("Balance = " + checkingAccount.balance);
        assertEquals(640,checkingAccount.balance);
    }

    @Test
    void withdraw() {
        checkingAccount.withdraw(20);
        assertEquals(80,checkingAccount.balance);
        System.out.println("Balance = " + checkingAccount.balance);
    }

    @Test
    void withdraw_branch(){
        assertThrows(IllegalArgumentException.class,() ->{ //lambda expression
            checkingAccount.withdraw_branch(600,false);
        });
        System.out.println(checkingAccount.balance);
    }

    @Test
    void purchase() {

        checkingAccount.purchase("Adidas",35);
        assertEquals(65, checkingAccount.balance);
        System.out.println("Balance = " + checkingAccount.balance);
    }
}