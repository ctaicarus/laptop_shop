/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.bookdao;

import com.laptopshop.cta.model.book.Book;

/**
 *
 * @author Admin
 */
public interface BookDAO {
    public void insert(Book book);
    public void edit(Book book);
    public void delete(Book book);
}
