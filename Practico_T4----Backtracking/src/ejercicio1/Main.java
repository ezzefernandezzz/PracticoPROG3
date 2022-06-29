package ejercicio1;

import GrafoYHerramientas.*;

public class Main {

	public static void main(String[] args) {
		Graph g = new DirectedGraph();
		
		Node r1 = new Node(1);		Node r2 = new Node(2);		Node r3 = new Node(3);
		Node r4 = new Node(4);		Node r5 = new Node(5);		Node r6 = new Node(6);
		Node r7 = new Node(7);		Node r8 = new Node(8);		Node r9 = new Node(9);
		Node r10 = new Node(10);		Node r11 = new Node(11);		Node r12 = new Node(12);
		Node r13 = new Node(13);		Node r14 = new Node(14);		Node r15 = new Node(15);
		Node r16 = new Node(16);
		//Node r17 = new Node(17);
		
		g.addNode(r1);	g.addNode(r2);	g.addNode(r3);	g.addNode(r4); 
		g.addNode(r5);	g.addNode(r6); 	g.addNode(r7); 	g.addNode(r8); 
		g.addNode(r9); 	g.addNode(r10); 	g.addNode(r11); 	g.addNode(r12); 
		g.addNode(r13); 	g.addNode(r14); 	g.addNode(r15); 	g.addNode(r16); 
		
		g.connectNodes(r1, r2); g.connectNodes(r1, r5); 
		g.connectNodes(r2, r3); g.connectNodes(r2, r6);
		g.connectNodes(r3, r4);
		g.connectNodes(r4, r8);
		g.connectNodes(r5, r6);
		g.connectNodes(r6, r7); g.connectNodes(r6, r10);
		g.connectNodes(r7, r3); g.connectNodes(r7, r8);
		g.connectNodes(r8, r12);
		g.connectNodes(r9, r13);
		g.connectNodes(r10, r9);
		g.connectNodes(r11, r10); g.connectNodes(r11, r15);
		g.connectNodes(r12, r11); g.connectNodes(r12, r16);
		g.connectNodes(r13, r14); g.connectNodes(r14, r15);
		g.connectNodes(r15, r16);
		
		//g.printGraph();
		
		recorrido_Maximo rm = new recorrido_Maximo();
		
		rm.encontrar_ruta(g, r1, r16);

	}

}
