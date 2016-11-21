package homeWork4;

import java.util.Scanner;

/**
 * Created by Markodius on 21.10.2016.
 */
public class Opn {

    public static void main(String[] args) {
        // Задача: ввести строку выражения с экрана и произвести указанные в выражении операции(+,-,*,/,(),^) с
        // Ограничения: Строка должна начинаться с положительного числа, нельзя упускать знак умножения перед или после скобки
        // контроль переполнения используемых типов отсутсвует
        // защита "от дурака" отсутсвует всякая

        Scanner scanner = new Scanner(System.in);
        int cifra=0,_i=0, _StrLn=0,_StrLnS=0,SkobPos=0,prior1=0,prior2=0;
        double chislo=0,sum=0;
        char ch,znak='a';
        String priority="()+-*/^",strchislo="";
        String [] OutStr=new String[100];
        double [] arrStack=new double [100];

        boolean _first=true,flagdot=false;
        System.out.print("Enter string type of: 11.1+2*(22-12)^2/10  ");
        String s1=scanner.nextLine(),s2="",sOut,stck="",_stck="";
        _StrLn=s1.length();
        int ind=0;
        // ---------------- Разберем строку в Обратную Польскую Запись -------------------------------
        for (_i=0; _i<_StrLn; _i++){
            ch=s1.charAt(_i);
            if (((ch-48>=0)&&(ch-48<10))||(ch=='.')){
                strchislo=strchislo+ch;

            }
            else {
                if (strchislo!="") {
                    chislo=Double.parseDouble(strchislo);
                    strchislo="";}
                //else chislo=0;

                strchislo="";
                if (chislo!=0){//sOut+=chislo+" ";
                    OutStr[ind]=""+chislo;
                    ind++;}
                chislo=0;
                if ((_first)||(ch=='(')){
                    _first=false;
                    stck=stck+ch;
                }
                else{
                    if (ch==')'){

                        _StrLnS=stck.length();
                        SkobPos=-1;
                        for(int j=0;j<_StrLnS;j++){
                            if (stck.charAt(j)=='('){
                                SkobPos=j;
                            }
                        }
                        OutStr[ind]=stck.substring(SkobPos+1);
                        ind++;
                        _stck="";
                        if (SkobPos>0) {_stck=stck.substring(0,SkobPos);
                        }
                        stck=_stck;

                    }
                    else{
                        _StrLnS=stck.length();
                        _stck="";
                        SkobPos=-1;
                        for(int j=0;j<_StrLnS;j++){
                            if (stck.charAt(j)=='('){
                                SkobPos=j;
                            }
                        }
                        String _stck1="";
                        if (SkobPos>=0){
                            _stck1=stck.substring(0,SkobPos+1);

                        }



                        //System.out.println(ch);
                        prior1=priority.indexOf(ch);
                        //if (SkobPos<0) SkobPos++;
                        //_stck=_stck+stck};
                        for (int j=SkobPos+1;j<_StrLnS;j++){
                            prior2=priority.indexOf(stck.charAt(j));
                            if (prior1<=prior2){
                                OutStr[ind]=""+stck.charAt(j);
                                ind++;
                            }
                            else {
                                _stck=_stck+stck.charAt(j);
                            }
                        }
                        //stck=_stck1+_stck+ch;
                        stck=_stck1+ch+_stck;


                    }

                }
            }
        }

        if (strchislo!="") {
            chislo=Double.parseDouble(strchislo);
            strchislo="";}
        if (chislo!=0) {
            OutStr[ind] = "" + chislo;
            ind++;
        }
        for (int i = 0; i < stck.length(); i++) {

            OutStr[ind] = "" + stck.charAt(i);
            ind++;
        }


        System.out.println("В ОПН будет выглядеть так");
        for (_i=0;_i<ind;_i++){
            System.out.print(OutStr[_i]+" ");

        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Решаем ОПН");
        prior1=0;
        for (_i=0;_i<ind;_i++){

            if ((OutStr[_i].charAt(0)=='+')||(OutStr[_i].charAt(0)=='-')||(OutStr[_i].charAt(0)=='*')||(OutStr[_i].charAt(0)=='/')||(OutStr[_i].charAt(0)=='^')){
                sum=arrStack[prior1-2];
                chislo=arrStack[prior1-1];
                if (OutStr[_i].charAt(0)=='+') sum=sum+chislo;
                if (OutStr[_i].charAt(0)=='-') sum=sum-chislo;
                if (OutStr[_i].charAt(0)=='*') sum=sum*chislo;
                if (OutStr[_i].charAt(0)=='/') sum=sum/chislo;
                if (OutStr[_i].charAt(0)=='^') sum=Math.pow(sum,chislo);
                arrStack[prior1-2]=sum;
                if (prior1>=2) prior1-=1;
            }
            else{

                arrStack[prior1] = Double.parseDouble(OutStr[_i]);
                prior1++;
            }
        }



        // поскольку последний идет не знак а число то выполним последнюю операцию уже после цикла:
        //  if (znak=='+'){
        //     sum+=chislo;

        //}
        // (znak=='-'){
//          sum-=chislo;
        //    }


        System.out.println("answer is: "+sum);

    }

}
