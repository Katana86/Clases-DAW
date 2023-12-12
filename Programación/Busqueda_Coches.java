/*Un taller nos piede que hagamos un programa 
que almcacene todos las marcas y modelos de coches 
y que permita su busqueda por la letra del abecedario*/

package repaso_esamen_primeraev;

import java.util.Scanner;

/**
 *
 * @author galil
 */
public class Busqueda_Coches {
    
    public static void main(String[] args){
        //Se llama a un SCANNER para que el usuario pueda almacenar su respuesta
        Scanner scan = new Scanner(System.in);
        //Se almacena la repuesta del usuario en una variable
        String usuario=null;
        //Mediante Array´s se almacenan las marcas de los Coches
        
        //MARCAS
        String [] marcas = {"---Lista de marcas---","Audi","Abarth","Alfa Romeo","BMW","Chevrolet","Citroën","Dacia","DS","Fiat","Ford","Honda","Hyundai","Jaguar","Jeep","Land Rover","Lexus","Mazda","Mercedes","Mitsubishi","Mini","Nissan","Opel","Peugeot","Porsche","Renault","Seat","Skoda","Smart","Ssangyong","Subaru","Suzuki","Tesla","Toyota","Volkswagen","Volvo","---------------------"};
        String [] modelos = {"---Lista de modelos---","---------AUDI---------","A1","A3","A4","A5","A6","A7","A8","e-tron","e-tron GT","e-tron Sportback","Q2","Q3","Q4","Q5","Q6 E-tron","Q7","Q8","Q8 e-tron","R8","TT","--------ABARTH-------","500","595","695","------ALFA ROMEO-----","Giulia","Giulietta","Stelvio","Tonale","---------BMW---------","i3","i4","i5","i7","iX","ix1","iX2","iX3","Serie 1","Serie 2","Serie 3","Serie 4","Serie 5","Serie 6","Serie 7","Serie 8","X1","X2","X3","X4","X5","X6","X7","XM","Z4","---------CHEVROLET---------","Corvette","---------CITROEN---------","AMI","Berlingo","C3","C3 Aircross","C4","C4 X","C5 Aircross","C5 X","E-C4","E-Jumpy","Spacetourer","---------DACIA---------","Duster","Jogger","Sandero","Spring","---------DS---------","3","4","7","9","---------FIAT---------","500","500X","600e","E-Ulysse","Panda","Tipo","Topolino","---------FORD---------","B-Max","Bronco","C-Max","EcoSport","Edge","Evos","Explorer","Fiesta","Focus","Galaxy","GT","Ka+","Kuga","Mustang","Puma","Ranger","S-Max","Tourneo","Transit","Honda","Hyundai","Jaguar","Jeep","Land Rover","Lexus","Mazda","Mercedes","Mitsubishi","Mini","Nissan","Opel","Peugeot","Porsche","Renault","Seat","Skoda","Smart","Ssangyong","Subaru","Suzuki","Tesla","Toyota","Volkswagen","Volvo","---------------------"};
        String [] A = {"Audi","Abarth","Alfa Romeo"};
        String [] MA = {"---------AUDI---------","A1","A3","A4","A5","A6","A7","A8","e-tron","e-tron GT","e-tron Sportback","Q2","Q3","Q4","Q5","Q6 E-tron","Q7","Q8","Q8 e-tron","R8","TT","--------ABARTH-------","500","595","695","------ALFA ROMEO------","Giulia","Giulietta","Stelvio","Tonale"};
        String [] B = {"BMW"};
        String [] MB = {"---------BMW---------","i3","i4","i5","i7","iX","ix1","iX2","iX3","Serie 1","Serie 2","Serie 3","Serie 4","Serie 5","Serie 6","Serie 7","Serie 8","X1","X2","X3","X4","X5","X6","X7","XM","Z4"};
        String [] C = {"Chevrolet","Citroën"};
        String [] MC = {"---------CHEVROLET---------","Corvette","---------CITROEN---------","AMI","Berlingo","C3","C3 Aircross","C4","C4 X","C5 Aircross","C5 X","E-C4","E-Jumpy","Spacetourer"};
        String [] D = {"Dacia","DS"};
        String [] MD = {"---------DACIA---------","Duster","Jogger","Sandero","Spring","---------DS---------","3","4","7","9"};
        String [] F = {"Fiat","Ford"};
        String [] H = {"Honda","Hyundai"};
        String [] J = {"Jaguar","Jeep"};
        String [] L = {"Land Rover","Lexus"};
        String [] M = {"Mazda","Mercedes","Mitsubishi","Mini"};
        String [] N = {"Nissan"};
        String [] O = {"Opel"};
        String [] P = {"Peugeot","Porsche"};
        String [] R = {"Renault"};
        String [] S = {"Seat","Skoda","Smart","Ssangyong","Subaru","Suzuki"};
        String [] T = {"Tesla","Toyota"};
        String [] V = {"Volkswagen","Volvo"};
        /////////////////////////////////////
        System.out.println("¿Que desea buscar?");
        System.out.println("Marcas o Modelos");
        usuario = scan.next();
        if (usuario.equalsIgnoreCase("Marcas")){
         //Con un para se imprime el array de marcas en pantalla
        for (int i=0;i<marcas.length;i++){
            System.out.println(" "+marcas[i]+" ");
        }
        //Pregunta la letra al usuario para filtrar las posibles marcas
        System.out.println("Introduzca una letra para ordenar la lista de marcas");
        //El usuario introduce la letra en el Scanner
        usuario = scan.next();
        //Mediante un SÍ detecta si el usuario a introducido la letra imprimira su respectivo ARRAY y en caso de no existir ninguna marca imprimira un error en pantalla
 /////////////////////////////////////////7//////////////////////////INICIO LISTA ALFABETICA/////////////////////////////////////////////////////////////////////////////////////       
            //A
            if (usuario.equalsIgnoreCase("A")){
            for (int a=0;a<A.length;a++){
                System.out.println(" "+A[a]+" ");
            }
                //B
                }else if (usuario.equalsIgnoreCase("B")){
                 for (int b=0;b<B.length;b++){
                System.out.println(" "+B[b]+" ");
                }
                    //C
                    }else if (usuario.equalsIgnoreCase("C")){
                    for (int c=0;c<C.length;c++){
                    System.out.println(" "+C[c]+" ");
                    }
                        //D
                        }else if (usuario.equalsIgnoreCase("D")){
                        for (int d=0;d<D.length;d++){
                        System.out.println(" "+D[d]+" ");
                    }
                        //E
                        }else if (usuario.equalsIgnoreCase("E")){
                            System.err.println("No existe ninguna marca");
                            //F
                            }else if (usuario.equalsIgnoreCase("F")){
                            for (int f=0;f<F.length;f++){
                            System.out.println(" "+F[f]+" ");
                   }
                            //G
                            }else if (usuario.equalsIgnoreCase("G")){
                            System.err.println("No existe ninguna marca");
                            //H
                                }else if (usuario.equalsIgnoreCase("H")){
                                for (int h=0;h<H.length;h++){
                                System.out.println(" "+H[h]+" ");
                   }
                                //I
                                }else if (usuario.equalsIgnoreCase("I")){
                                System.err.println("No existe ninguna marca");
                                    //J
                                    }else if (usuario.equalsIgnoreCase("J")){
                                    for (int j=0;j<J.length;j++){
                                    System.out.println(" "+J[j]+" ");
                   }
                                    //K
                                    }else if (usuario.equalsIgnoreCase("K")){
                                    System.err.println("No existe ninguna marca");
                                        //L
                                        }else if (usuario.equalsIgnoreCase("L")){
                                        for (int l=0;l<L.length;l++){
                                        System.out.println(" "+L[l]+" ");
                   }
                                            //M
                                            }else if (usuario.equalsIgnoreCase("M")){
                                            for (int m=0;m<M.length;m++){
                                            System.out.println(" "+M[m]+" ");
                   }
                                                //N
                                                }else if (usuario.equalsIgnoreCase("N")){
                                                for (int n=0;n<N.length;n++){
                                                System.out.println(" "+N[n]+" ");
                   }
                                                    //O
                                                    }else if (usuario.equalsIgnoreCase("O")){
                                                    for (int o=0;o<O.length;o++){
                                                    System.out.println(" "+O[o]+" ");
                   }
                                                        //P
                                                        }else if (usuario.equalsIgnoreCase("P")){
                                                        for (int p=0;p<P.length;p++){
                                                        System.out.println(" "+P[p]+" ");
                   }
                                                            //R
                                                            }else if (usuario.equalsIgnoreCase("R")){
                                                            for (int r=0;r<R.length;r++){
                                                            System.out.println(" "+R[r]+" ");
                   }
                                                                //S
                                                                }else if (usuario.equalsIgnoreCase("S")){
                                                                for (int s=0;s<S.length;s++){
                                                                System.out.println(" "+S[s]+" ");
                   }
                                                                    //T
                                                                    }else if (usuario.equalsIgnoreCase("T")){
                                                                    for (int t=0;t<T.length;t++){
                                                                    System.out.println(" "+T[t]+" ");
                   }
                                                                        //V
                                                                        }else if (usuario.equalsIgnoreCase("V")){
                                                                        for (int v=0;v<V.length;v++){
                                                                        System.out.println(" "+V[v]+" ");
                   }
                                                                            }
//////////////////////////////////////////////////////////////FIN DE LA LISTA////////////////////////////////////////////////////////////////////////////////////////////77
        }else if (usuario.equalsIgnoreCase("Modelos")){
             for (int j=0;j<modelos.length;j++){
            System.out.println(" "+modelos[j]+" ");
        }
        //Pregunta la letra al usuario para filtrar las posibles marcas
        System.out.println("Introduzca una letra para ordenar la lista de marcas");
        //El usuario introduce la letra en el Scanner
        usuario = scan.next();
        //Mediante un SÍ detecta si el usuario a introducido la letra imprimira su respectivo ARRAY y en caso de no existir ninguna marca imprimira un error en pantalla
 /////////////////////////////////////////7//////////////////////////INICIO LISTA ALFABETICA/////////////////////////////////////////////////////////////////////////////////////       
            //A
            if (usuario.equalsIgnoreCase("A")){
            for (int ma=0;ma<MA.length;ma++){
                System.out.println(" "+MA[ma]+" ");
            }
                //B
                }else if (usuario.equalsIgnoreCase("B")){
                 for (int mb=0;mb<MB.length;mb++){
                System.out.println(" "+MB[mb]+" ");
                }
                    //C
                    }else if (usuario.equalsIgnoreCase("C")){
                    for (int mc=0;mc<MC.length;mc++){
                    System.out.println(" "+MC[mc]+" ");
                    }
                        //D
                        }else if (usuario.equalsIgnoreCase("D")){
                        for (int md=0;md<MD.length;md++){
                        System.out.println(" "+MD[md]+" ");
                    }
                        //E
                        }else if (usuario.equalsIgnoreCase("E")){
                            System.err.println("No existe ninguna marca");
                            //F
                            }else if (usuario.equalsIgnoreCase("F")){
                            for (int f=0;f<F.length;f++){
                            System.out.println(" "+F[f]+" ");
                   }
                            //G
                            }else if (usuario.equalsIgnoreCase("G")){
                            System.err.println("No existe ninguna marca");
                            //H
                                }else if (usuario.equalsIgnoreCase("H")){
                                for (int h=0;h<H.length;h++){
                                System.out.println(" "+H[h]+" ");
                   }
                                //I
                                }else if (usuario.equalsIgnoreCase("I")){
                                System.err.println("No existe ninguna marca");
                                    //J
                                    }else if (usuario.equalsIgnoreCase("J")){
                                    for (int j=0;j<J.length;j++){
                                    System.out.println(" "+J[j]+" ");
                   }
                                    //K
                                    }else if (usuario.equalsIgnoreCase("K")){
                                    System.err.println("No existe ninguna marca");
                                        //L
                                        }else if (usuario.equalsIgnoreCase("L")){
                                        for (int l=0;l<L.length;l++){
                                        System.out.println(" "+L[l]+" ");
                   }
                                            //M
                                            }else if (usuario.equalsIgnoreCase("M")){
                                            for (int m=0;m<M.length;m++){
                                            System.out.println(" "+M[m]+" ");
                   }
                                                //N
                                                }else if (usuario.equalsIgnoreCase("N")){
                                                for (int n=0;n<N.length;n++){
                                                System.out.println(" "+N[n]+" ");
                   }
                                                    //O
                                                    }else if (usuario.equalsIgnoreCase("O")){
                                                    for (int o=0;o<O.length;o++){
                                                    System.out.println(" "+O[o]+" ");
                   }
                                                        //P
                                                        }else if (usuario.equalsIgnoreCase("P")){
                                                        for (int p=0;p<P.length;p++){
                                                        System.out.println(" "+P[p]+" ");
                   }
                                                            //R
                                                            }else if (usuario.equalsIgnoreCase("R")){
                                                            for (int r=0;r<R.length;r++){
                                                            System.out.println(" "+R[r]+" ");
                   }
                                                                //S
                                                                }else if (usuario.equalsIgnoreCase("S")){
                                                                for (int s=0;s<S.length;s++){
                                                                System.out.println(" "+S[s]+" ");
                   }
                                                                    //T
                                                                    }else if (usuario.equalsIgnoreCase("T")){
                                                                    for (int t=0;t<T.length;t++){
                                                                    System.out.println(" "+T[t]+" ");
                   }
                                                                        //V
                                                                        }else if (usuario.equalsIgnoreCase("V")){
                                                                        for (int v=0;v<V.length;v++){
                                                                        System.out.println(" "+V[v]+" ");
                   }
                                                                            }
        }
        
        
    }
}