package com.projeto.crud_thymeleaf_springboot.controller;

import com.projeto.crud_thymeleaf_springboot.model.Cliente;
import com.projeto.crud_thymeleaf_springboot.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clienteService.findAll());
        return "listagem";
    }

    @PostMapping
    public String salvarCliente(@Valid Cliente cliente, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("pageTitle", cliente.getId() == null ? "Novo Cliente" : "Editar Cliente");
            return "form";
        }

        clienteService.save(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/novo")
    public String showFormForAdd(Model model) {
        model.addAttribute("cliente", new Cliente());

        model.addAttribute("pageTitle", "Novo Cliente");
        return "form";
    }

    @GetMapping("/editar/{id}")
    public String showFormForUpdate(@PathVariable("id") Long id, Model model) {
        Cliente cliente = clienteService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID do Cliente inválido:" + id));

        model.addAttribute("cliente", cliente);

        model.addAttribute("pageTitle", "Editar Cliente");

        return "form";
    }

    @GetMapping("/excluir/{id}")
    public String excluirCliente(@PathVariable("id") Long id) {
        clienteService.deleteById(id);
        return "redirect:/clientes";
    }
}