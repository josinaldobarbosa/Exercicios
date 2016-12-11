# x == y		# x eh igual a y
# x != y        # x eh diferente de y
# x > y         # x eh maior que y
# x < y         # x eh menor que y
# x >= y        # x eh maior ou igual a y
# x <= y        # x eh menor ou igual a y

# and			# x == y and y == z 	# x eh igual a y e y eh igual a z
# or			# // ou
# not			# not(x > y)			# verdadeiro se x nao for maior que y

if 5 > 0:
  print '5 eh maior que 0'

if 7 < 3:
	pass # pass para ignorar a linha

n1 = 10;
n2 = 20;

if n1 != n2:
  print n1, 'eh diferente de', n2

if n1 == n2:
	print n1, 'e', n2, 'sao iguais.'
elif n1 > n2:
	print n1, 'eh maior que', n2
elif n1 < n2:
	print n1, 'eh menor que', n2
else:
	print 'isso nunca ira acontecer'

n1 = 1
n2 = 1
n3 = 1
if n1 == n2 and n2 == n3:
	print 'sim'