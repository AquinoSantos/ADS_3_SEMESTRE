numeros = []

for i in range(8):
    num = float(input(f"Digite o {i+1}º número: "))
    numeros.append(num)


positivos = [num for num in numeros if num > 0]


removidos = len(numeros) - len(positivos)


print(f"\nLista original: {numeros}")
print(f"Lista sem negativos: {positivos}")
print(f"Números removidos: {removidos}")