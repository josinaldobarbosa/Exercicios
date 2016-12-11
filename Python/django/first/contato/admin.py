# -*- coding: utf-8 -*-
from django.contrib import admin

from .models import Pessoa, Telefone, Email


class TelefoneInline(admin.TabularInline):
    model = Telefone
    extra = 0


class EmailInline(admin.TabularInline):
    model = Email
    extra = 0


class PessoaAdmin(admin.ModelAdmin):
    fieldsets = [
        (u'Informações pessoais', {'fields': ['nome', 'data_nascimento', 'estado_civil']}),
    ]
    list_display = ['nome', 'data_nascimento']
    list_filter = ['estado_civil']
    search_fields = ['nome']
    inlines = [EmailInline, TelefoneInline]


admin.site.register(Pessoa, PessoaAdmin)
