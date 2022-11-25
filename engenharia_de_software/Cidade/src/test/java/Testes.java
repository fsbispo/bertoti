/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.List;
import main.cidade.Cidade;
import main.cidade.Pessoa;
import main.cidade.Residencia;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Aluno
 */
public class Testes {
    
    public Testes() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public void testes(){
        Cidade cidade = new Cidade();
		
	// 1 classe de equival�ncia: 0 pessoas, lista vazia
        assertEquals(cidade.getPessoas().size(), 0);
        
        // 1 classe de equival�ncia para registrar um pessoa(objeto)
	cidade.registerPessoa(new Pessoa("11111111111", new Residencia("Jardim Terras de Santa Helena", "Praca Ajaj Najm Rachid", "12"), "Marcio", "masculino"));		
	assertEquals(cidade.getPessoas().size(), 1); // apenas 1 pessoas registrado
        
        // 1 classe de equival�ncia para registrar n pessoas(objetos)
		cidade.registerPessoa(new Pessoa("22222222222", new Residencia("Jardim Terras de Santa Helena", "Rua 1", "33"), "Roberta", "feminio"));
		cidade.registerPessoa(new Pessoa("33333333333", new Residencia("Jardim Terras de Santa Helena", "Praca Ajaj Najm Rachid", "50"), "Felipe", "masculino"));
		
		assertEquals(cidade.getPessoas().size(), 3); //3 pessoas registrados
		
		// Testes de classe de equivalência para o método findToResidencia()
		
		//1 classe de equivalência: 0 pessoas encontrados (estou testando “lista vazia”)
		List<Pessoa> founds = cidade.findToResidencia(new Residencia("Jardim Dindinha", "Rua Maria José", "99"));
		
		assertEquals(founds.size(), 0);
		
		//1 classe de equivalência: 1 pessoas encontrados (guardando 1 objeto)
		List<Pessoa> founds2 = cidade.findToResidencia(new Residencia("Jardim Terras de Santa Helena", "Rua 1", "33"));
		assertEquals(founds2.size(), 1);
		
		//1 classe de equivalência: n pessoas encontrados (guardando n objetos)
		
		cidade.registerPessoa(new Pessoa("55555555555", new Residencia("Jardim Terras de Santa Helena", "Rua 1", "33"), "Pamela", "feminino"));
		cidade.registerPessoa(new Pessoa("77777777777", new Residencia("Jardim Terras de Santa Helena", "Rua 1", "33"), "Osvaldo", "masculino"));

		List<Pessoa> founds3 = cidade.findToResidencia(new Residencia("Jardim Terras de Santa Helena", "Rua 1", "33"));
		
		assertEquals(founds3.size(),3);

		//Testes de Classes de Equivalencia para o método findToCpf()
		//1 classe de equivalencia retorna 1 pessoa
		Pessoa pessoa1 = cidade.findToCpf("77777777777");
		assertEquals(pessoa1.getResidencia().getRuaResidencia(), "Rua 1");
		assertEquals(pessoa1.getResidencia().getNumeroResidencia(), "33");
		
		//1 classe de equivalencia retorna null
		Pessoa pessoa2 = cidade.findToCpf("12345678910");
		assertEquals(pessoa2, null);
    }
}
