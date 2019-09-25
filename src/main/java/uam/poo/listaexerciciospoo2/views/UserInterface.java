package uam.poo.listaexerciciospoo2.views;

import java.util.ArrayList;
import java.util.Scanner;
import uam.poo.listaexerciciospoo2.models.*;

/**
 * @author NycolasVieira
 */
public class UserInterface {

    public static ArrayList<Rectangle> rectangles;
    public static ArrayList<Circle> circles;
    public static UserInterfaceMethods interfaceMethod;

    public static void main(String[] args) {
        rectangles = new ArrayList<>();
        circles = new ArrayList<>();
        interfaceMethod = new UserInterfaceMethods();
        
        menuOptions();
    }

    public static void menuOptions() {
        var finish = 1;
        var scanner = new Scanner(System.in);

        while (finish == 1) {
            System.out.println("--------------------------------------------");
            System.out.println("- VER LISTA DE ELEMENTOS => 6");
            System.out.println("- CRIAR FORMA GEOMÉTRICA => 5");
            System.out.println("- INSERIR ÁREA           => 4");
            System.out.println("- RESGATAR ÁREA          => 3");
            System.out.println("- INSERIR PERÍMETRO      => 2");
            System.out.println("- RESGATAR PERÍMETRO     => 1");
            System.out.println("- FINALIZAR SESSÃO       => 0");
            System.out.print("=> ");
            int menuOption = scanner.nextInt();
            System.out.println("--------------------------------------------");

            switch (menuOption) {
                case 6:
                    getListGeometricForm(scanner);
                    break;

                case 5:
                    createGeometricForm(scanner);
                    break;

                case 4:
                    setAreaGeometricForm(scanner);
                    break;

                case 3:
                    getAreaGeometricForm(scanner);
                    break;

                case 2:
                    setPerimeterGeometricForm(scanner);
                    break;

                case 1:
                    getPerimeterGeometricForm(scanner);
                    break;

                case 0:
                    scanner.close();
                    System.out.println("\nSESSÃO FINALIZADA\n");
                    return;

                default:
                    System.out.println("\nCOMANDO INVÁLIDO, TENTE NOVAMENTE\n");
            }
        }
    }

    public static void getListGeometricForm(Scanner scanner) {
        var finish = 1;

        while (finish == 1) {
            System.out.println("--------------------------------------------");
            System.out.println("- LISTA DE CÍRCULO   => 2");
            System.out.println("- LISTA DE RETÂNGULO => 1");
            System.out.println("- VOLTAR             => 0");
            System.out.print("=> ");
            int menuOption = scanner.nextInt();
            System.out.println("--------------------------------------------");

            switch (menuOption) {
                case 2:
                    interfaceMethod.showCircleList(circles);
                    break;

                case 1:
                    interfaceMethod.showRectangleList(rectangles);
                    break;
                
                case 0:
                    return;
                    
                default:
                    System.out.println("\nCOMANDO INVÁLIDO, TENTE NOVAMENTE\n");
            }
        }
    }
    
    public static void createGeometricForm(Scanner scanner) {
        var finish = 1;

        while (finish == 1) {
            System.out.println("--------------------------------------------");
            System.out.println("- CRIAR CÍRCULO   => 2");
            System.out.println("- CRIAR RETÂNGULO => 1");
            System.out.println("- VOLTAR          => 0");
            System.out.print("=> ");
            int menuOption = scanner.nextInt();
            System.out.println("--------------------------------------------");

            switch (menuOption) {
                case 2:
                    circles.add(interfaceMethod.createCircle(scanner));
                    break;

                case 1:
                    rectangles.add(interfaceMethod.createRectangle(scanner));
                    break;
                
                case 0:
                    return;
                    
                default:
                    System.out.println("\nCOMANDO INVÁLIDO, TENTE NOVAMENTE\n");
            }
        }
    }
    
    public static void setAreaGeometricForm(Scanner scanner) {
        var finish = 1;

        while (finish == 1) {
            System.out.println("--------------------------------------------");
            System.out.println("- INSRERIR ÁREA DO CÍRCULO   => 2");
            System.out.println("- INSRERIR ÁREA DO RETÂNGULO => 1");
            System.out.println("- VOLTAR                     => 0");
            System.out.print("=> ");
            int menuOption = scanner.nextInt();
            System.out.println("--------------------------------------------");

            switch (menuOption) {
                case 2:
                    break;

                case 1:
                    break;
                
                case 0:
                    return;
                    
                default:
                    System.out.println("\nCOMANDO INVÁLIDO, TENTE NOVAMENTE\n");
            }
        }
    }
    
    public static void getAreaGeometricForm(Scanner scanner) {
        var finish = 1;

        while (finish == 1) {
            System.out.println("--------------------------------------------");
            System.out.println("- RESGATAR ÁREA DO CÍRCULO   => 2");
            System.out.println("- RESGATAR ÁREA DO RETÂNGULO => 1");
            System.out.println("- VOLTAR                     => 0");
            System.out.print("=> ");
            int menuOption = scanner.nextInt();
            System.out.println("--------------------------------------------");

            switch (menuOption) {
                case 2:
                    break;

                case 1:
                    break;
                
                case 0:
                    return;
                    
                default:
                    System.out.println("\nCOMANDO INVÁLIDO, TENTE NOVAMENTE\n");
            }
        }
    }
    
    public static void setPerimeterGeometricForm(Scanner scanner) {
        var finish = 1;

        while (finish == 1) {
            System.out.println("--------------------------------------------");
            System.out.println("- INSRERIR PERÍMETRO DO CÍRCULO   => 2");
            System.out.println("- INSRERIR PERÍMETRO DO RETÂNGULO => 1");
            System.out.println("- VOLTAR                          => 0");
            System.out.print("=> ");
            int menuOption = scanner.nextInt();
            System.out.println("--------------------------------------------");

            switch (menuOption) {
                case 2:
                    break;

                case 1:
                    break;
                
                case 0:
                    return;
                    
                default:
                    System.out.println("\nCOMANDO INVÁLIDO, TENTE NOVAMENTE\n");
            }
        }
    }
    
    public static void getPerimeterGeometricForm(Scanner scanner) {
        var finish = 1;

        while (finish == 1) {
            System.out.println("--------------------------------------------");
            System.out.println("- RESGATAR PERÍMETRO DO CÍRCULO   => 2");
            System.out.println("- RESGATAR PERÍMETRO DO RETÂNGULO => 1");
            System.out.println("- VOLTAR                          => 0");
            System.out.print("=> ");
            int menuOption = scanner.nextInt();
            System.out.println("--------------------------------------------");

            switch (menuOption) {
                case 2:
                    break;

                case 1:
                    break;
                
                case 0:
                    return;
                    
                default:
                    System.out.println("\nCOMANDO INVÁLIDO, TENTE NOVAMENTE\n");
            }
        }
    }
}
