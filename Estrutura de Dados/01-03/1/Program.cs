int n = 0, soma = 0, counter = 1;
List<int> numeros = new List<int>();

Console.WriteLine();
Console.WriteLine("Digite 9999 para sair");
Console.WriteLine();

while (true)
{
    Console.Write(counter++ + " - ");
    n = int.Parse(Console.ReadLine());

    if (n == 9999)
    {
        break;
    }

    else
    {
        numeros.Add(n);
        soma = soma + n;
    }
}

Console.Clear();

Console.WriteLine("Os números digitados foram:");

for (int i = 0; i < numeros.Count; i++)
{
    Console.WriteLine(numeros[i]);
}

Console.WriteLine("A soma é de: " + soma);
