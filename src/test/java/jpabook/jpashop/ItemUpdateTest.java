//package jpabook.jpashop;
//
//import jpabook.jpashop.domain.item.Book;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.persistence.EntityManager;
//
//@SpringBootTest
//public class ItemUpdateTest {
//    @Autowired
//    EntityManager em;
//
//    @Test
//    public void updateTest() throws Exception{
//        Book book = em.find(Book.class, 1L);
//
//        // 트랜잭션 안에서는 아래와 같게
//        book.setName("현진sql-b");
//        // 트랜잭션 커밋이 되면 변경에 대해 jpa가 찾아서 자동으로 수정 쿼리 작성(변경 감지 == dirty checking)
//
//    }
//
//}
