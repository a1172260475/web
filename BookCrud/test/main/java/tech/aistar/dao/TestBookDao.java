package tech.aistar.dao;

import org.junit.Test;
import tech.aistar.dao.impl.BookDaoImpl;
import tech.aistar.entity.Book;
import tech.aistar.entity.BookType;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/1/23 0023.
 */
public class TestBookDao {
    private IBookDao bookDao = new BookDaoImpl();

    /**
     * img src="${path}/img/${b.imgUrl}"
     * String bookName, double price, String author, String publisHouse, Date createDate, String imgUrl
     */
    @Test
    public void testSave(){
        //模拟很多的图书的数据
        Book b1;
        //author  bookname  creatdate img  price  publihouse  typeid
        for (int i=0 ;i<5;i++){
            b1 = new Book("米饭",3.0,"***","让胡路",new Date(),"rice.png");
            BookType t1 = new BookType();
            t1.setId(1);//设置的id的值,表中一定是有记录的
            b1.setBookType(t1);
            bookDao.save(b1);
        }
        Book b2;
        for (int i=0 ;i<10;i++){
            b2 = new Book("荷塘小炒",32.0,"****","山塘街",new Date(),"vegetables.png");
            BookType t2 = new BookType();
            t2.setId(2);//设置的id的值,表中一定是有记录的
            b2.setBookType(t2);
            bookDao.save(b2);
        }

        Book b3;
        for (int i=0 ;i<4;i++){
            b3 = new Book("梅菜扣肉",56.0,"*****","平江路",new Date(),"meat.png");
            BookType t3 = new BookType();
            t3.setId(3);//设置的id的值,表中一定是有记录的
            b3.setBookType(t3);
            bookDao.save(b3);
        }

        Book b4;
        for (int i=0 ;i<20;i++){
            b4 = new Book("麻酱油麦菜",26.0,"****","南京路",new Date(),"vegetables2.png");
            BookType t2 = new BookType();
            t2.setId(2);//设置的id的值,表中一定是有记录的
            b4.setBookType(t2);
            bookDao.save(b4);
        }


       /* Book b2 = new Book("东坡肉",100.0,"民间","山塘街",new Date(),"dpr.png");
        Book b3 = new Book("桂花酿",100.0,"民间","让胡路",new Date(),"ghn.png");
        Book b4 = new Book("梅菜扣肉",50.0,"民间","平江路",new Date(),"mckr.png");
        Book b5 = new Book("东坡肉",100.0,"民间","山塘街",new Date(),"dpr.png");
        Book b6 = new Book("桂花酿",100.0,"民间","让胡路",new Date(),"ghn.png");
        Book b7 = new Book("梅菜扣肉",50.0,"民间","平江路",new Date(),"mckr.png");
        Book b8 = new Book("东坡肉",100.0,"民间","山塘街",new Date(),"dpr.png");
        Book b9 = new Book("桂花酿",100.0,"民间","让胡路",new Date(),"ghn.png");*/

        //图书类型

       /* BookType t1 = new BookType();
        t1.setId(1);//设置的id的值,表中一定是有记录的
        b1.setBookType(t1);*/
        /*b2.setBookType(t1);
        b3.setBookType(t1);
        b4.setBookType(t1);


        BookType t2 = new BookType();
        t2.setId(2);
        b5.setBookType(t2);
        b6.setBookType(t2);

        BookType t3 = new BookType();
        t3.setId(3);
        b7.setBookType(t3);
        b8.setBookType(t3);
        b9.setBookType(t3);*/

        //调用保存图书的方法
      /*  bookDao.save(b1);*/
       /* bookDao.save(b2);
        bookDao.save(b3);
        bookDao.save(b4);
        bookDao.save(b5);
        bookDao.save(b6);
        bookDao.save(b7);
        bookDao.save(b8);
        bookDao.save(b9);*/
    }

    @Test
    public void testFindAll(){
        List<Book> books = bookDao.findAll("肉");

        for(Book b:books){
            System.out.println(b);
            System.out.println("\t"+b.getBookType());
        }
    }
}
