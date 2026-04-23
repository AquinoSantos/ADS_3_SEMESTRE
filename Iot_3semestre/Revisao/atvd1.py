idades = []

while True:
    idade = int(input("Digite uma idade (ou -1 para encerrar): "))
    
    if (idade == -1):
        break
    else:
        idades.append(idade)

contagem = 0

for x in idades:
    print(x,end='|')
    if (x >= 18):
        contagem = contagem+1
        
    
media = sum(idades)/len(idades)
print(f"\n Média das idades: {media:.0f}")
print(f"\n A quantidade de idades acima de 18 é: {contagem}")
    
   