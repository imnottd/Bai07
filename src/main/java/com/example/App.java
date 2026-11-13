package com.example;

import java.util.List; // Lỗi 1: Unused import

public class App {

    // Lỗi 2: Tên biến vi phạm chuẩn (phải là camelCase, không được dùng gạch dưới và viết hoa)
    public int Bad_Variable_Name = 100;

    public int add(int a, int b) {
        return a + b;
    }
}