int soma = 0, counter = 1, n = 0;

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
        soma = soma + n;
    }
}

numeros.Sort();

Console.Clear();

Console.WriteLine("Lista: " + string.Join(" - ", numeros));

Console.WriteLine("Soma = " + soma);

Console.WriteLine();