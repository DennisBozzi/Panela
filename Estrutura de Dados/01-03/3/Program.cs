int counter = 1, n = 0;

List<int> numeros = new List<int>();

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
    }
}

numeros.Sort();
numeros.Reverse();

Console.Clear();

Console.WriteLine("Lista: " + string.Join(" - ", numeros));

Console.WriteLine();

Console.Write("Digite um número:");
n = int.Parse(Console.ReadLine());

Console.WriteLine();

Boolean confere = false;

for (int i = 0; i < numeros.Count; i++)
{
    if (n == numeros[i])
    {
        Console.WriteLine(n + " pertence a lista!");
        confere = true;
        Console.WriteLine();
        break;
    }
}

if (confere == false) {
    Console.WriteLine(n + " não pertence a lista!");
    Console.WriteLine();
}

