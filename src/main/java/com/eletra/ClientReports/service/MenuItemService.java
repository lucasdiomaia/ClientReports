package com.eletra.ClientReports.service;

import com.eletra.ClientReports.model.MenuItem;
import com.eletra.ClientReports.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;

    @Autowired
    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    // Método para salvar ou atualizar um MenuItem
    @Transactional
    public MenuItem saveMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    // Método para buscar todos os MenuItems
    public List<MenuItem> findAllMenuItems() {
        return menuItemRepository.findAll();
    }

    // Método para buscar um MenuItem pelo ID
    public Optional<MenuItem> findMenuItemById(int id) {
        return menuItemRepository.findById(id);
    }

    // Método para deletar um MenuItem
    @Transactional
    public void deleteMenuItem(int id) {
        menuItemRepository.deleteById(id);
    }

    // Exemplo de método para atualizar parte de um MenuItem
    @Transactional
    public MenuItem updateMenuItem(int id, String newName) {
        MenuItem menuItem = menuItemRepository.findById(id).orElseThrow(() ->
                new RuntimeException("MenuItem not found: " + id));
        menuItem.setName(newName);
        return menuItemRepository.save(menuItem);
    }
}
