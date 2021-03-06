import { Injectable } from '@angular/core';
import { RequestOptionsArgs } from '@angular/http';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

import { Produto } from '../_model/produto.model';


@Injectable()
export class ProdutoService {
	readonly  href = '/api/produto';

	constructor(private http: HttpClient) { }

	getProdutos(data: Params): Observable<Produto[]> {
		let url = this.href;
		if(data && data.fornecedorId)
			url +='/fornecedor/'+data.fornecedorId;

		return this.http.get<Produto[]>(url)
	}

	getRepoIssues(sort: string, order: string, page: number): Observable<DataGrid<Produto>> {
		const requestUrl = `${this.href}?q=repo:angular/material2&sort=${sort}&order=${order}&page=${page + 1}`;
		return this.http.get<DataGrid<Produto>>(requestUrl);
	}

	deleteProduto(id : number){
		return this.http.delete<any>(this.href + '/' + id);
	}

	getProduto(id : number ){
		return this.http.get<Produto>(this.href + '/' + id);
	}

	postProduto(produto: Produto) {
		return this.http.post<Produto>(this.href, produto);
	}

	putProduto(produto: Produto) {
		return this.http.put<Produto>(this.href + '/' + produto.id, produto);
	}
}

export interface DataGrid<T> {
	items: T[];
	total_count: number;
}

export interface Params {
	fornecedorId: number;

}

