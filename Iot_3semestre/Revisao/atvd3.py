notas = []

for i in range(5):
    while True:
        try:
            nota = float(input(f"Digite a {i + 1}ª (de 0 a 10): "))
            if 0 <= nota <= 10:
                notas.append(nota)
                break
            else:
                print("Erro! A nota deve estar entre 0 e 10.")
        except ValueError:
            print("Erro! Digite um número válido.")

media = sum(notas) / len(notas)
acima_media = sum(1 for nota in notas if nota > media)
abaixo_media = sum(1 for nota in notas if nota < media)

print(f"\nMédia das notas: {media:.2f}")
print(f"Notas acima da média: {acima_media}")
print(f"Notas abaixo da média: {abaixo_media}")
