public class Main {
    public static void main(String[] args) {
        //RunTimeException -> tipo não verificado
       /* public static void lancarExecao(int a)throws Exception{
        if(a<0) {
            //Execption é verificado sou obrigado a tratar
            throw new IllegalArgumentException("Parametro inválido");
        }
        }*/
        int a = 0;
        int b=a;
        double d=0;
        String s =null;
        s.toLowerCase();
        try {
            int vetor[] = {0};
            vetor[10] = 10;

            //captura exceção
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            e.printStackTrace();
        }//Esse bloco sempre é executado após o try e o catch
        finally {
            System.out.println("Estou no finally");
        }
        /*public static void main2(){
            //RunTimeException -> tipo não verificado

            try {
                int vetor[] = {0};
                vetor[10] = 10;

                //captura exceção
            } catch (Exception e) {
                System.out.println("erro: " + e.getMessage());
                e.printStackTrace();
            }//Esse bloco sempre é executado após o try e o catch
            finally {
                System.out.println("Estou no finally");
            }*/

        }
    }

