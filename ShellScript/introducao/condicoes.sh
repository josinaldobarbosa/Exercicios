min=0
max=10

echo -n "Digite um valor entre $min e $max: "
read valor

# STRINGS
# -n string1 : variável não está vazia
# -z string1 : variável está vazia
# string1 = string2 : string1 e string2 são identicas
# string1 != string2 : string e string2 são diferentes

# NUMEROS
# n1 -eq n2 : n1 possui o mesmo valor que n2
# n1 -ne n2 : n1 nao possui o mesmo valor que n2
# n1 -gt n2 : n1 é maior que n2
# n1 -ge n2 : n1 é maior ou igual a n2
# n1 -lt n2 : n1 é menor que n2
# n1 -le n2 : n1 é menor ou igual a n2
# e nome_arquivo : verifica se nome_arquivo existe
# d nome_arquivo : verifica se nome_arquivo é um diretório
# f nome_arquivo : verifica se nome_arquivo é um arquivo regular(text, imagem, programa, docs, planilhas)

n1=
test -z $n1 && echo "n1 está vazia"

n2=
test -n $n2 && echo "n2 não está vazia" #não está funcionando :S

n1=5
n2=5
test $n1 = $n2 && echo "n1 é igual a n2"

#Exemplos if 1 (valor < min)
if [ "$valor" -lt $min ];
then
 echo "1 - valor é menor que o min"
fi

#Exemplo if 2 (valor >= min)
if test $valor -ge $min;
 then
  echo "2 - valor é maior ou igual ao min"
 else
  echo "2 - valor não é maior ou igual ao min"
fi

#Exemplo if 3 (valor > min)
if [ "$valor" == $min ];
 then
  echo "3 - valor maior é igual a min"
elif [ "$valor" -eq 1 ];
 then 
  echo "3 - valor é igual a 1"
else
 echo "3 - valor não é maior que o min"
fi

#Exmplo case
case $valor in 
 0)
  echo "case valor 0"
 ;;
 1)
  echo "case valor 1"
 ;;
 2)
  echo "case valor 2"
 ;;
esac

#Exemplo loop for
for i in 0 1 2;
do
 echo "contando... $i"
done

echo "Contando decrescente"

for i in {5..0};
do
 echo "$i"
done

echo "Com intervalo de 3"

for i in $(seq 0 3 10); # sem intervalo $(seq 0 10);
do
 echo "$i"
done

# Exemplo while
echo -n "Digite valores, -1 para sair: "
read valor;

while [ $valor != "-1" ];
do
 ((total=$total+$valor)) # somando valores
 echo -n "Total até agora $total: "
 read valor;
done
