numeros = []

for i in range(5):
    num = float(input(f"Digite o {i+1}º número: "))
    numeros.append(num)

maior = max(numeros)
menor = min(numeros)

posicao_maior = numeros.index(maior)
posicao_menor = numeros.index(menor)

print(f"\nMaior valor: {maior} (posição {posicao_maior})")
print(f"Menor valor: {menor} (posição {posicao_menor})")