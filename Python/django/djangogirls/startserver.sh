#!/bin/bash

# Entra no virtual env
. myenv/bin/activate

# Entra na pasta
cd mysite

# Roda django
python manage.py runserver