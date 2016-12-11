def show():
  print 'Funciona :)'
  mostra()

def mostra():
  print "Mostrando"

def soma(n1, n2):
	return n1 + n2

def recursividade(valor):
	if valor == 0:
		print '...Fim...'
		return
	else:
		print '...', valor,'...'
		recursividade(valor-1)

##### Inicia #####
show()
print soma(5, 5)
soma(1.5, 1.7)
soma("Roma", "Mesa")
recursividade(5)