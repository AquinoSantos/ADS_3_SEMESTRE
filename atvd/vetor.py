import random

numeros = [23,44,56,74,1,21,33,"Ana"]
nomes = ['Rayan', 'Alessandra', 'Melissa', 'Lucas', 'Davi', 'Nicolas', 'Sara','Talysson', 'Daniel', 'Aquino', 'Vitoria']

#append() é um método utilizado para adicionar um elemento ao final de uma lista.
#insert() é um método utilizado para adicionar um elemento em uma posição específica de uma lista.


#>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

#pop() é um método utilizado para remover um elemento de uma lista. Ele pode ser usado para remover o último elemento ou um elemento em uma posição específica.
#remove() é um método utilizado para remover a primeira ocorrência de um elemento específico em uma lista. Ele procura o elemento na lista e o remove, se encontrado. Se o elemento não estiver presente na lista, ele gera um erro.


#>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



#sort() serve para ordenar o vetor
#reverse() serve para inverter a ordem dos elementos do vetor
#len() serve para contar a quantidade de elementos do vetor
#max() serve para encontrar o maior valor do vetor
#min() serve para encontrar o menor valor do vetor
#sum() serve para calcular a soma dos elementos do vetor
#random.choice() serve para escolher um elemento aleatório de uma lista


sortudo = random.choice(nomes)

print(f"O Aluno sortudo foi: {sortudo}")