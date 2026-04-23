numeros = []

print("Digite 7 números:")
for i in range(7):
    num = int(input(f"Número {i+1}: "))
    numeros.append(num)


numero_busca = int(input("\nDigite um número para buscar: "))


if numero_busca in numeros:

    indice = numeros.index(numero_busca)
    print(f"Número encontrado!")
    print(f"Posição (índice): {indice}")
else:
    print("Número não encontrado!")
    