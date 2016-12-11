# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.db import models


class Pessoa(models.Model):

    ESTADO_CIVIL = [
        (u'solteiro', u'Solteiro'),
        (u'casado', u'Casado'),
        (u'divorciado', 'Divorciado')
    ]

    nome = models.CharField(u'Nome', max_length=255, null=False)
    data_nascimento = models.DateField(null=False, verbose_name=u'Data de nascimento')
    estado_civil = models.CharField(choices=ESTADO_CIVIL, max_length=50)

    def __str__(self):
        return self.nome


class Telefone(models.Model):
    pessoa = models.ForeignKey(Pessoa, on_delete=models.CASCADE)
    telefone = models.IntegerField()

    def __str__(self):
        return str(self.telefone)


class Email(models.Model):
    pessoa = models.ForeignKey(Pessoa, on_delete=models.CASCADE)
    email = models.EmailField()

    def __str__(self):
        return self.email