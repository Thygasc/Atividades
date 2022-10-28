import random
import string

def GeradorSenha(dificuldade):
    senha=''
    dificuldade = int(dificuldade)
    if dificuldade == 1:
        valores = string.ascii_lowercase + string.ascii_uppercase
        tamanho = 5
    elif dificuldade == 2:
        valores = string.ascii_lowercase + string.ascii_uppercase + string.digits
        tamanho = 7
    elif dificuldade == 3:
        valores = string.ascii_lowercase + string.ascii_uppercase + string.digits + string.punctuation
        tamanho = 10
    elif dificuldade == 4:
        valores = string.ascii_lowercase + string.ascii_uppercase + string.digits + string.punctuation
        tamanho=int(input("Digite o tamanho da senha>> "))
    else:
        print("Dificuldade invalida \nDigite um numero entre 1 e 4")

    for i in range(tamanho):
        senha += random.choice(valores)    
    print (senha)

dificuldade = input("Digite a dificuldade da senha: \n1 - Senha Fácil(letras) \n2 - Senha Médio(letras e digitos) \n3 - Senha Forte(letra, digitos e pontuacoes \n4 - Tamanho da senha personalizada\n")
GeradorSenha(dificuldade)