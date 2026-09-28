package io.github.Lucas_santanaS.produtosapi.repository;

import io.github.Lucas_santanaS.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, String> {
}
