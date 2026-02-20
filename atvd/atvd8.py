


n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))

operacao = input("Digite a operação (+, -, *, /): ")

if operacao == "+":
    resultado = n1 + n2
elif operacao == "-":
    resultado = n1 - n2
elif operacao == "*":
    resultado = n1 * n2
elif operacao == "/":
    if n1 != 0 and n2 != 0:
        resultado = n1 / n2
    else:
        print("Erro: divisão por zero não é permitida.")
        exit()
else:
    print("Operação inválida.")
    exit()

print(f"O resultado da operação é: {resultado}")