#!/bin/bash
echo "🔄 Limpando e preparando diretório de saída..."
rm -rf out
mkdir -p out
echo "🧵 Compilando arquivos Java..."
javac -cp gson-2.10.1.jar -d out $(find src -name "*.java")
if [ $? -eq 0 ]; then
  echo "✅ Compilação bem-sucedida."
  echo "🚀 Executando app.ConversorApp..."
  java -cp "gson-2.10.1.jar:out" app.ConversorApp
else
  echo "❌ Erro na compilação. Verifique os arquivos .java."
fi
