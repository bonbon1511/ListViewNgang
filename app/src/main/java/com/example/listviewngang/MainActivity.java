package com.example.listviewngang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import book.Book;
import category.Category;
import category.CategoryAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvCategory=findViewById(R.id.rcv_category);
        categoryAdapter=new CategoryAdapter(this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }
    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();
        List<Book> listBook1 = new ArrayList<>();
        listBook1.add(new Book(R.drawable.ic_hocsinh, "Bài đọc 1"));
        listBook1.add(new Book(R.drawable.ic_hocsinh1, "Bài đọc 2"));
        listBook1.add(new Book(R.drawable.ic_hocsinh2, "Bài đọc 3"));
        listBook1.add(new Book(R.drawable.ic_hocsinh3, "Bài đọc 4"));
        listBook1.add(new Book(R.drawable.ic_hocsinh4, "Bài đọc 5"));
        listBook1.add(new Book(R.drawable.ic_hocsinh5, "Bài đọc 6"));
        listCategory.add(new Category("Đọc Tiếng Anh", listBook1));

        List<Book> listBook2 = new ArrayList<>();
        listBook2.add(new Book(R.drawable.ic_dv1, "Bài nghe 1"));
        listBook2.add(new Book(R.drawable.ic_dv2, "Bài nghe 2"));
        listBook2.add(new Book(R.drawable.ic_dv3, "Bài nghe 3"));
        listBook2.add(new Book(R.drawable.ic_dv4, "Bài nghe 4"));
        listBook2.add(new Book(R.drawable.ic_dv5, "Bài nghe 5"));
        listBook2.add(new Book(R.drawable.ic_dv6, "Bài nghe 6"));
        listCategory.add(new Category("Nghe Tiếng Anh", listBook2));


        List<Book> listBook3 = new ArrayList<>();
        listBook3.add(new Book(R.drawable.ic_dv7, "Bài viết 1"));
        listBook3.add(new Book(R.drawable.ic_dv8, "Bài viết 2"));
        listBook3.add(new Book(R.drawable.ic_dv9, "Bài viết 3"));
        listBook3.add(new Book(R.drawable.dv_10, "Bài viết 4"));
        listBook3.add(new Book(R.drawable.ic_dv11, "Bài viết 5"));
        listBook3.add(new Book(R.drawable.ic_dv12, "Bài viết 6"));
        listCategory.add(new Category("Viết Tiếng Anh", listBook3));


        List<Book> listBook4 = new ArrayList<>();
        listBook4.add(new Book(R.drawable.ic_dv13, "Bài nói 1"));
        listBook4.add(new Book(R.drawable.ic_dv14, "Bài nói 2"));
        listBook4.add(new Book(R.drawable.ic_dv15, "Bài nói 3"));
        listBook4.add(new Book(R.drawable.ic_dv16, "Bài nói 4"));
        listBook4.add(new Book(R.drawable.ic_dv17, "Bài nói 5"));
        listBook4.add(new Book(R.drawable.ic_dv18, "Bài nói 6"));
        listCategory.add(new Category("Nói Tiếng Anh", listBook4));
        return listCategory;
    }
}