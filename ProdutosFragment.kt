package com.example.dstyle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dstyle.databinding.FragmentProdutosBinding

class ProdutosFragment : Fragment() {
    private var _binding: FragmentProdutosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProdutosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = ProdutosFragmentArgs.fromBundle(requireArguments())
        binding.tvProdutoId.text = "Produto selecionado: ${args.produtoId}"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
