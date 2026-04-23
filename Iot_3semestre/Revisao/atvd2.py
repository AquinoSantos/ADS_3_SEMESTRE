numeros = []

for i in range(6):
    num = int(input(f"Digite o {i+1}º número inteiro: "))
    numeros.append(num)

pares = sum(1 for num in numeros if num % 2 == 0)
impares = sum(1 for num in numeros if num % 2 != 0)

print(f"\nLista completa: {numeros}")
print(f"Números pares: {pares}")
print(f"Números ímpares: {impares}")