package com.example.demo;

public class FloydWarshallAlgorithm {

	//method to find the shortest path
	public String agoritmoFloyd(long[][] mAdy) {
		int vertices = mAdy.length;
		long matrizAdjacencia[][] = mAdy;
		String caminos[][] = new String[vertices][vertices]; //save all roads
		String caminosAux[][]= new String[vertices][vertices]; 
		String caminoRecorrido = "", cadena = "", caminitos ="";
		int i,j,k;
		float temp1, temp2, temp3, temp4, minimo;
		for(i = 0; i < vertices; i++) {
			for(j=0; j<vertices; j++) {
				caminos[i][j] = "";
				caminosAux[i][j] = "";
			}
			
		}
		for(k= 0; k<vertices; k++) {
			for(i=0; i< vertices;i++) {
				for(j=0; j<vertices; j++) {
					temp1 = matrizAdjacencia[i][j];
					temp2 = matrizAdjacencia[i][k];
					temp3 = matrizAdjacencia[k][j];
					temp4 = temp2 + temp3;
					minimo =  Math.min(temp1, temp4);
					if(temp1 != temp4) {
						if(minimo == temp4) {
							caminoRecorrido="";
							caminosAux[i][j]= k+"";
							caminos[i][j] = caminosR(i,k,caminosAux, caminoRecorrido) + (k +1);
						}
					}
					matrizAdjacencia[i][j]= (long)minimo;
				}
			}
		}
		for(i= 0; i<vertices; i++) {
			for(j= 0; j<vertices; j++) {
				cadena  = cadena + "[" + matrizAdjacencia[i][j] + "]";
			}
			cadena= cadena+"\n";
		}
		for(i= 0; i<vertices; i++) {
			for(j= 0; j<vertices; j++) {
				if(matrizAdjacencia[i][j] != 1000000000) {
					if(i!= j) {
						if(caminos[i][j].equals("")) {
							caminitos += "From {"+ (i+1)+"-->"+(j+1)+"} go for ..("+(i+1)+", "+(j+1)+")\n";
						}else {
							caminitos += "From {"+ (i+1)+"-->"+(j+1)+"} go for ..("+(i+1)+", "+caminos[i][j]
									+", "+(j+1)+")\n";
						}
					}
				}
			}
			
		}
		return "The matrix of shortest paths between the different vertices: \n" 
		+ cadena+ "\n the different shortest paths between vertices are: \n"
		+ caminitos;
	}
	
	public String caminosR(int i,int k, String[][] camAux, String camRecorrido) {
		if(camAux[i][k] == "") {
			return "";
		}else {
			//recursion
			camRecorrido += caminosR(i, Integer.parseInt(camAux[i][k].toString()), camAux, camRecorrido)+ (Integer.parseInt(camAux[i][k].toString())+1)
					+", ";
			return camRecorrido;
		}
	}
}
