/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.bookdao;

import com.laptopshop.cta.model.book.BookItem;

/**
 *
 * @author Admin
 */
public interface BookItemDAO {
    public void insertItem(BookItem bookItem);
    public void editItem(BookItem bookItem);
    public void deleteItem(BookItem bookItem);
    public BookItem searchByName(String name);
}
