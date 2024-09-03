import random

def createAleatoryList(size):
    myList = random.sample(range(0, 1000), size)
    return (myList)

def typeOfNumber(myList):
    for i in range(len(myList)):
        if myList[i]%3 == 0:
            print(myList[i], ': numero multiplo de 3')
        elif myList[i]%2 == 0:
            print(myList[i], ': numero par')
        else:
            print(myList[i], ': numero impar')

choose = int(input("Digite a quantidade de numeros da lista: "))
typeOfNumber(createAleatoryList(choose))