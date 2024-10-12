package com.example.appdigitalbank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appdigitalbank.adapter.AdapterPagamento
import com.example.appdigitalbank.adapter.AdapterProduto
import com.example.appdigitalbank.databinding.ActivityMainBinding
import com.example.appdigitalbank.model.Pagamento
import com.example.appdigitalbank.model.Produto

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private lateinit var adapterProduto: AdapterProduto
    private val listaPagamento: MutableList<Pagamento> = mutableListOf()
    private val listaProduto: MutableList<Produto> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val recyclerIconesPagamento = binding.recyclerIconesPagamento
        recyclerIconesPagamento.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIconesPagamento.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this, listaPagamento)
        recyclerIconesPagamento.adapter = adapterPagamento
        listaIconesPagamento()

        val recyclerProdutos = binding.recyclerProdutos
        recyclerProdutos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerProdutos.setHasFixedSize(true)
        adapterProduto = AdapterProduto(this, listaProduto)
        recyclerProdutos.adapter = adapterProduto
        listaTextoInformativo()

    }

    private fun listaIconesPagamento() {
        val icone1 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icone1)
        val icone2 = Pagamento(R.drawable.barcode, "Pagar")
        listaPagamento.add(icone2)
        val icone3 = Pagamento(R.drawable.emprestimo, "Pegar \n Emprestado")
        listaPagamento.add(icone3)
        val icone4 = Pagamento(R.drawable.transferencia, "Transferir")
        listaPagamento.add(icone4)
        val icone5 = Pagamento(R.drawable.depositar, "Depositar")
        listaPagamento.add(icone5)
        val icone6 = Pagamento(R.drawable.ic_cobrar, "Cobrar")
        listaPagamento.add(icone6)
        val icone7 = Pagamento(R.drawable.ic_recarga, "Recarga de celular")
        listaPagamento.add(icone7)
        val icone8 = Pagamento(R.drawable.doacao, "Doação")
        listaPagamento.add(icone8)
    }

    private fun listaTextoInformativo() {
        val textoInformativo1 = Produto("Participe da Promoção e concorra a...")
        listaProduto.add(textoInformativo1)
        val textoInformativo2 = Produto("Pague sua fatura com débito automático!")
        listaProduto.add(textoInformativo2)
        val textoInformativo3 = Produto("Ganhe pontos para gastar em sua próxima compra!")
        listaProduto.add(textoInformativo3)
        val textoInformativo4 = Produto("Suas compras em até 16x sem juros!")
        listaProduto.add(textoInformativo4)
    }
}